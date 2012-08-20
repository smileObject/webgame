package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.common.msg.GCSystemMessage;
import com.pwrd.war.gameserver.common.msg.GCSystemNotice;
import com.pwrd.war.gameserver.common.msg.GCWaitingStart;
import com.pwrd.war.gameserver.common.msg.GCWaitingOver;
import com.pwrd.war.gameserver.common.msg.CGPing;
import com.pwrd.war.gameserver.common.msg.GCPing;
import com.pwrd.war.gameserver.common.msg.GCHandshake;
import com.pwrd.war.gameserver.common.msg.GCShowOptionDlg;
import com.pwrd.war.gameserver.common.msg.CGSelectOption;
import com.pwrd.war.gameserver.common.msg.GCCommonAskAndAnswerUrl;
import com.pwrd.war.gameserver.common.msg.GCSystemPrompt;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class CommonMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.GC_SYSTEM_MESSAGE, GCSystemMessage.class);
		map.put(MessageType.GC_SYSTEM_NOTICE, GCSystemNotice.class);
		map.put(MessageType.GC_WAITING_START, GCWaitingStart.class);
		map.put(MessageType.GC_WAITING_OVER, GCWaitingOver.class);
		map.put(MessageType.CG_PING, CGPing.class);
		map.put(MessageType.GC_PING, GCPing.class);
		map.put(MessageType.GC_HANDSHAKE, GCHandshake.class);
		map.put(MessageType.GC_SHOW_OPTION_DLG, GCShowOptionDlg.class);
		map.put(MessageType.CG_SELECT_OPTION, CGSelectOption.class);
		map.put(MessageType.GC_COMMON_ASK_AND_ANSWER_URL, GCCommonAskAndAnswerUrl.class);
		map.put(MessageType.GC_SYSTEM_PROMPT, GCSystemPrompt.class);
		return map;
	}

}