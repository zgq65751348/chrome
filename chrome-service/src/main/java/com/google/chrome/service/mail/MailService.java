package com.google.chrome.service.mail;


import cn.hutool.core.date.ChineseDate;
import cn.hutool.extra.emoji.EmojiUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

@Configuration
@Slf4j(topic = "QQ邮件服务")
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendAttachFileMail(Long id) {
        new Thread(() -> {
            try {
                MimeMessage mimeMessage = javaMailSender.createMimeMessage();
                ChineseDate chineseDate = new ChineseDate(new Date());
                // true表示构建一个可以带附件的邮件对象
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
                String alias = EmojiUtil.toAlias("😄");//:smile:
                helper.setSubject("订单过期提醒"+alias);
                helper.setFrom("65751348@qq.com");
                helper.setTo("65751348@qq.com");
                //helper.setCc("37xxxxx37@qq.com");
                //helper.setBcc("14xxxxx098@qq.com");
                helper.setSentDate(new Date());
                helper.setText("<p>hello 亲爱的用户，您的订单"+id+"已经过期，这封邮件包含两种图片，分别如下</p><p>第一张图片：</p><img src='cid:p01'/><p>第二张图片：</p><img src='cid:p02'/>",true);
                // 第一个参数是自定义的名称，后缀需要加上，第二个参数是文件的位置
                helper.addAttachment("资料.xlsx",new File("C:\\Users\\Estee Lauder\\Desktop\\钢铁烈阳菜狗记录.xlsx"));
                helper.addInline("p01",new FileSystemResource(new File("C:\\Users\\Estee Lauder\\Pictures\\Saved Pictures\\160112135146-21-lp.jpg")));
                helper.addInline("p02",new FileSystemResource(new File("C:\\Users\\Estee Lauder\\Pictures\\Saved Pictures\\160112135146-3-lp.jpg")));
                String festival = "无";
                if(null == chineseDate.getFestivals() || "".equals(chineseDate.getFestivals())){
                    festival = chineseDate.getFestivals();
                }
                log.info("====>异步任务开始:天干地支<{}>     生肖:<{}>   节日:<{}>",chineseDate.getCyclicalYMD(),chineseDate.getChineseZodiac(),festival);
                javaMailSender.send(mimeMessage);
            }catch (MessagingException e){
                e.printStackTrace();
            }
        },"<英特尔® 至强®>").start();

    }
}
