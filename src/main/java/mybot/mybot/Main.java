package mybot.mybot;

import java.awt.Color;
import java.io.File;
import java.nio.channels.Channel;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;

public class Main {
    public static void main(String[] args) {
        String token = "비밀";
        DiscordApi api = new DiscordApiBuilder()//인텐드 모두 활성화
        	    .setToken("비밀")
        	    .setAllIntents()
        	    .login()
        	    .join();
        DiscordApi api1 = new DiscordApiBuilder().setToken(token).login().join();
        api1.updateActivity("[온라인 / Online]");
        api1.addMessageCreateListener(event -> {
            if(event.getMessageContent().equalsIgnoreCase("//ping")) {
                event.getChannel().sendMessage("Pong!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//도움말")) {
            	EmbedBuilder help = new EmbedBuilder()
            			.setColor(Color.CYAN)
            		    .setTitle("스프링 봇 도움말 / Spring Bot Help")
            		    .setDescription("개발자: Spring_Discord#7425\n언어: Java\n명령어의 접미사는 // 입니다.")
            			.addField("- //ping", "Pong 으로 봇이 답변하는 명령어입니다.")
            			.addField("- //embed", "기본적인 임베드를 내보내는 명령어입니다.")
            			.addField("- //wasans, //sans, //샌즈", "와! 샌즈를 말하는 명령어입니다.")
            			.addField("- //개발자 호출", "봇 개발자를 맨션하는 명령어입니다.")
            			.addField("- 준비중", "준비중입니다.");
    			
            	event.getChannel().sendMessage(help);
            }
            if(event.getMessageContent().equalsIgnoreCase("//embed")) {
            	EmbedBuilder test = new EmbedBuilder()
            			.setColor(Color.gray)//회색
            		    .setTitle("Title")
            		    .setDescription("Description")
            		    .addField("Field", "Text");
            	event.getChannel().sendMessage(test);
            }
            if(event.getMessageContent().equalsIgnoreCase("//emoji check mark")) {
                event.getChannel().sendMessage("Check Mark Emoji :white_check_mark:");
            }
            if(event.getMessageContent().equalsIgnoreCase("//check embed")) {
            	EmbedBuilder check = new EmbedBuilder()
            			.setColor(Color.GREEN)//초록색
            		    .setTitle("체크 / Check")
            		    .setDescription(":white_check_mark: 체크임베드 입니다.");
            	event.getChannel().sendMessage(check);
            }
            if(event.getMessageContent().equalsIgnoreCase("//테스트")) {
            	event.getChannel().sendMessage("테스트 / Test");
            }
            if(event.getMessageContent().equalsIgnoreCase("//wasans")) {
            	event.getChannel().sendMessage("와! 샌즈! / Wa! Sans!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//sans")) {
            	event.getChannel().sendMessage("와! 샌즈! / Wa! Sans!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//샌즈")) {
            	event.getChannel().sendMessage("와! 샌즈! / Wa! Sans!");
            }
	    if(event.getMessageContent().wqualsIgnoreCase("//맨션") {
		event.getChannel().sendMessage("<@!691184476797009941>");
            
            	});
        System.out.println("봇이 시작되었습니다. / Bot Start.");
    }

		
	}
