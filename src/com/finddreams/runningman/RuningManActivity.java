package com.finddreams.runningman;

import com.example.runningman.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 * @Description: 奔跑小人的动画进度条对话框，可以用作加载数据界面
 * @author http://blog.csdn.net/finddreams
 */ 
public class RuningManActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_runing_man);
	}
	/**
	 * 显示美团进度对话框
	 * @param v
	 */
	public void showmeidialog(View v){
		CustomProgressDialog dialog =new CustomProgressDialog(this, "正在加载中",R.anim.frame);
		dialog.show();
	}
	/**
	 * 显示顺丰快递员进度对话框
	 * @param v
	 */
	public void showsfdialog(View v){
		CustomProgressDialog dialog =new CustomProgressDialog(this, "正在加载中",R.anim.frame2);
		dialog.show();
	}
}
