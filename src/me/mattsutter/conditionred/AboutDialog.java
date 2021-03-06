package me.mattsutter.conditionred;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class AboutDialog extends Dialog {
	public static final String APACHE_ACK = "This product includes software developed by the Apache Software Foundation";
	public static final String APACHE_URL = "http://www.apache.org";
	//public static final String COPYRIGHT = "\u00a9";
	public static final String ABOUT_TEXT = "Copyright \u00a9 2012 Matt Sutter. All rights reserved.";
	public static final String APP_URL = "http://www.conditionred.net";
	
	public AboutDialog(Context context){
		super(context);
		this.requestWindowFeature(Window.FEATURE_LEFT_ICON);
		this.setTitle(context.getString(R.string.app_name) + " " + context.getString(R.string.version_code));
		this.setContentView(R.layout.about_dialog);
		this.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_launcher);
		this.setCancelable(true);

		//TextView app_name = (TextView) findViewById(R.id.about_app_name);
		//app_name.setText(context.getString(R.string.app_name) + " " + context.getString(R.string.version_code));
		TextView main_text = (TextView) findViewById(R.id.about_main_text);
		main_text.setText(ABOUT_TEXT 
				+ "\n" + APP_URL
				+ "\n\n" + APACHE_ACK 
				+ "\n" + APACHE_URL + "\n");
		Button button = (Button) findViewById(R.id.ok_button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				dismiss();
			}
		});
	}
}
