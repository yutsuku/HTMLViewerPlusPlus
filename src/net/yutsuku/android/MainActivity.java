package net.yutsuku.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity extends Activity {
	@SuppressLint("SetJavaScriptEnabled")

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		String filePath = getIntent().getData().getEncodedPath();
		super.onCreate(savedInstanceState);
		
		//Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("file://" + filePath);
	}

}