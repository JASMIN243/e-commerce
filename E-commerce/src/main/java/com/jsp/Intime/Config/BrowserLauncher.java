package com.jsp.Intime.Config;

import java.awt.Desktop;
import java.net.URI;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class BrowserLauncher {
	@EventListener(ApplicationReadyEvent.class)
public void Launch() {
	System.setProperty("java.awt.headless", "false");
	Desktop desk=Desktop.getDesktop();
	try {
		desk.browse(new URI("http://localhost:8080"));
	}
	catch(Exception e) {
		
	}
}
}
