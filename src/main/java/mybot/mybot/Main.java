package mybot.mybot;

import java.awt.Color;
import java.io.File;
import java.nio.channels.Channel;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;

public class Main {
    public static void main(String[] args) {
        String token = "Nzc4MTExMjQxNzk3MTA3NzIz.X7NOkA.DHetLBmk9shFRPSNHwO4tKfj56w";
        DiscordApi api = new DiscordApiBuilder()//���ٵ� ��� Ȱ��ȭ
        	    .setToken("Nzc4MTExMjQxNzk3MTA3NzIz.X7NOkA.DHetLBmk9shFRPSNHwO4tKfj56w")
        	    .setAllIntents()
        	    .login()
        	    .join();
        DiscordApi api1 = new DiscordApiBuilder().setToken(token).login().join();
        api1.updateActivity("[�¶��� / Online]");
        api1.addMessageCreateListener(event -> {
            if(event.getMessageContent().equalsIgnoreCase("//ping")) {
                event.getChannel().sendMessage("Pong!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//����")) {
            	EmbedBuilder help = new EmbedBuilder()
            			.setColor(Color.CYAN)
            		    .setTitle("������ �� ���� / Spring Bot Help")
            		    .setDescription("������: Spring_Discord#7425\n���: Java\n��ɾ��� ���̻�� // �Դϴ�.")
            			.addField("- //ping", "Pong ���� ���� �亯�ϴ� ��ɾ��Դϴ�.")
            			.addField("- //embed", "�⺻���� �Ӻ��带 �������� ��ɾ��Դϴ�.")
            			.addField("- //wasans, //sans, //����", "��! ��� ���ϴ� ��ɾ��Դϴ�.")
            			.addField("- �غ���", "�غ����Դϴ�.")
            			.addField("- �غ���", "�غ����Դϴ�.");
    			
            	event.getChannel().sendMessage(help);
            }
            if(event.getMessageContent().equalsIgnoreCase("//embed")) {
            	EmbedBuilder test = new EmbedBuilder()
            			.setColor(Color.gray)//ȸ��
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
            			.setColor(Color.GREEN)//�ʷϻ�
            		    .setTitle("üũ / Check")
            		    .setDescription(":white_check_mark: üũ�Ӻ��� �Դϴ�.");
            	event.getChannel().sendMessage(check);
            }
            if(event.getMessageContent().equalsIgnoreCase("//�׽�Ʈ")) {
            	event.getChannel().sendMessage("�׽�Ʈ / Test");
            }
            if(event.getMessageContent().equalsIgnoreCase("//wasans")) {
            	event.getChannel().sendMessage("��! ����! / Wa! Sans!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//sans")) {
            	event.getChannel().sendMessage("��! ����! / Wa! Sans!");
            }
            if(event.getMessageContent().equalsIgnoreCase("//����")) {
            	event.getChannel().sendMessage("��! ����! / Wa! Sans!");
            }
            
            	});
        System.out.println("���� ���۵Ǿ����ϴ�. / Bot Start.");
    }

		
	}
