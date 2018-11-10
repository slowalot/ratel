package org.nico.ratel.landlords.client.event;

import org.nico.ratel.landlords.client.SimpleClient;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_CLIENT_CONNECT extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		SimplePrinter.printNotice("Connection to server successful !!");
		SimpleClient.id = Integer.parseInt(data);
	}

}