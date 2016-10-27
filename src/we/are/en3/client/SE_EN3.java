package we.are.en3.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import we.are.en3.client.view.ContentsView;
import we.are.en3.client.view.MapContentsView;
import we.are.en3.client.view.View;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SE_EN3 implements EntryPoint {
	
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		View view = new View();
	    RootPanel.get("viewContainer").add(view);
//		ContentsView view = new ContentsView();
//	    RootPanel.get("viewContainer").add(view);	    
//	    MapContentsView view = new MapContentsView();
//	    RootPanel.get("viewContainer").add(view);

	}
}
