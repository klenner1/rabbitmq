package com.javaee.klenner.rabbitmq.services;

import com.javaee.klenner.rabbitmq.domain.Message;

public interface MessageService {

	void sendMessage(Message message);
}