package com.csdn.fresco;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;



public class Main extends Activity {

	private android.widget.Button button;
	private com.facebook.drawee.view.SimpleDraweeView myimageview;
	private android.widget.RelativeLayout activitymain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	//点击事件加载网络图片代码
	public void loadInternetImage(View view){
		Uri uri = Uri.parse("http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
		SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);


		GenericDraweeHierarchy hinearchy= GenericDraweeHierarchyBuilder.newInstance(getResources())
				.setRoundingParams(RoundingParams.asCircle())
				.setFadeDuration(5000)
				.build();
		draweeView.setHierarchy(hinearchy);

		DraweeController controller=Fresco.newDraweeControllerBuilder()
				.setUri(uri)
				.setTapToRetryEnabled(true)
				.build();

		draweeView.setController(controller);
































		//draweeView.setImageURI(uri);
	}
}
