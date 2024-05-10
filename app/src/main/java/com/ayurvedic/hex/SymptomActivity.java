package com.ayurvedic.hex;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.location.*;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class SymptomActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private TextView textview1;
	private ImageView imageview2;
	private LinearLayout linear3;
	private TextView textview2;
	private LinearLayout linear8;
	private LinearLayout linear44;
	private LinearLayout linear49;
	private LinearLayout linear54;
	private LinearLayout linear59;
	private LinearLayout linear64;
	private LinearLayout linear69;
	private LinearLayout linear74;
	private LinearLayout linear79;
	private LinearLayout linear88;
	private ImageView imageview3;
	private LinearLayout linear9;
	private LinearLayout linear4;
	private TextView textview3;
	private ImageView imageview4;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private TextView textview5;
	private ImageView imageview5;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private TextView textview7;
	private ImageView imageview6;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private TextView textview9;
	private ImageView imageview7;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private TextView textview11;
	private ImageView imageview8;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private TextView textview13;
	private ImageView imageview9;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private TextView textview15;
	private ImageView imageview10;
	private LinearLayout linear75;
	private LinearLayout linear76;
	private TextView textview17;
	private ImageView imageview11;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private TextView textview19;
	private ImageView imageview13;
	private LinearLayout linear89;
	private LinearLayout linear90;
	private TextView textview23;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.symptom);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		imageview2 = findViewById(R.id.imageview2);
		linear3 = findViewById(R.id.linear3);
		textview2 = findViewById(R.id.textview2);
		linear8 = findViewById(R.id.linear8);
		linear44 = findViewById(R.id.linear44);
		linear49 = findViewById(R.id.linear49);
		linear54 = findViewById(R.id.linear54);
		linear59 = findViewById(R.id.linear59);
		linear64 = findViewById(R.id.linear64);
		linear69 = findViewById(R.id.linear69);
		linear74 = findViewById(R.id.linear74);
		linear79 = findViewById(R.id.linear79);
		linear88 = findViewById(R.id.linear88);
		imageview3 = findViewById(R.id.imageview3);
		linear9 = findViewById(R.id.linear9);
		linear4 = findViewById(R.id.linear4);
		textview3 = findViewById(R.id.textview3);
		imageview4 = findViewById(R.id.imageview4);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		textview5 = findViewById(R.id.textview5);
		imageview5 = findViewById(R.id.imageview5);
		linear50 = findViewById(R.id.linear50);
		linear51 = findViewById(R.id.linear51);
		textview7 = findViewById(R.id.textview7);
		imageview6 = findViewById(R.id.imageview6);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		textview9 = findViewById(R.id.textview9);
		imageview7 = findViewById(R.id.imageview7);
		linear60 = findViewById(R.id.linear60);
		linear61 = findViewById(R.id.linear61);
		textview11 = findViewById(R.id.textview11);
		imageview8 = findViewById(R.id.imageview8);
		linear65 = findViewById(R.id.linear65);
		linear66 = findViewById(R.id.linear66);
		textview13 = findViewById(R.id.textview13);
		imageview9 = findViewById(R.id.imageview9);
		linear70 = findViewById(R.id.linear70);
		linear71 = findViewById(R.id.linear71);
		textview15 = findViewById(R.id.textview15);
		imageview10 = findViewById(R.id.imageview10);
		linear75 = findViewById(R.id.linear75);
		linear76 = findViewById(R.id.linear76);
		textview17 = findViewById(R.id.textview17);
		imageview11 = findViewById(R.id.imageview11);
		linear80 = findViewById(R.id.linear80);
		linear81 = findViewById(R.id.linear81);
		textview19 = findViewById(R.id.textview19);
		imageview13 = findViewById(R.id.imageview13);
		linear89 = findViewById(R.id.linear89);
		linear90 = findViewById(R.id.linear90);
		textview23 = findViewById(R.id.textview23);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), OneActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), TwoActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), ThereActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), FourActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), FiveActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), SixActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), SevenActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), EightActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), NineActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear88.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), TenActivity.class);
				startActivity(i);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		imageview2.setVisibility(View.INVISIBLE);
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear44.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear49.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear54.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear59.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear64.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear74.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear79.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear88.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear61.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
	}
	
	@Override
	public void onBackPressed() {
		i.setClass(getApplicationContext(), HomeActivity.class);
		startActivity(i);
		finish();
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}