package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.mail.msg.CGMailList;
import com.pwrd.war.gameserver.mail.msg.GCMailUpdate;
import com.pwrd.war.gameserver.mail.msg.GCHasNewMail;
import com.pwrd.war.gameserver.mail.msg.GCMailList;
import com.pwrd.war.gameserver.mail.msg.CGReadMail;
import com.pwrd.war.gameserver.mail.msg.CGSendMail;
import com.pwrd.war.gameserver.mail.msg.GCSendMail;
import com.pwrd.war.gameserver.mail.msg.CGDelMail;
import com.pwrd.war.gameserver.mail.msg.CGDelAllMail;
import com.pwrd.war.gameserver.mail.msg.CGSaveMail;
import com.pwrd.war.gameserver.mail.msg.CGSendGuildMail;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class MailMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_MAIL_LIST, CGMailList.class);
		map.put(MessageType.GC_MAIL_UPDATE, GCMailUpdate.class);
		map.put(MessageType.GC_HAS_NEW_MAIL, GCHasNewMail.class);
		map.put(MessageType.GC_MAIL_LIST, GCMailList.class);
		map.put(MessageType.CG_READ_MAIL, CGReadMail.class);
		map.put(MessageType.CG_SEND_MAIL, CGSendMail.class);
		map.put(MessageType.GC_SEND_MAIL, GCSendMail.class);
		map.put(MessageType.CG_DEL_MAIL, CGDelMail.class);
		map.put(MessageType.CG_DEL_ALL_MAIL, CGDelAllMail.class);
		map.put(MessageType.CG_SAVE_MAIL, CGSaveMail.class);
		map.put(MessageType.CG_SEND_GUILD_MAIL, CGSendGuildMail.class);
		return map;
	}

}
