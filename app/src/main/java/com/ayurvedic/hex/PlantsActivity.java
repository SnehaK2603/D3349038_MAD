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

public class PlantsActivity extends AppCompatActivity {
	
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
	private LinearLayout linear64;
	private LinearLayout linear69;
	private LinearLayout linear74;
	private LinearLayout linear79;
	private LinearLayout linear88;
	private LinearLayout linear84;
	private LinearLayout linear91;
	private LinearLayout linear95;
	private LinearLayout linear99;
	private LinearLayout linear103;
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
	private ImageView imageview14;
	private LinearLayout linear85;
	private LinearLayout linear86;
	private TextView textview24;
	private ImageView imageview15;
	private LinearLayout linear92;
	private LinearLayout linear93;
	private TextView textview25;
	private ImageView imageview16;
	private LinearLayout linear96;
	private LinearLayout linear97;
	private TextView textview26;
	private ImageView imageview17;
	private LinearLayout linear100;
	private LinearLayout linear101;
	private TextView textview27;
	private ImageView imageview18;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private TextView textview28;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.plants);
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
		linear64 = findViewById(R.id.linear64);
		linear69 = findViewById(R.id.linear69);
		linear74 = findViewById(R.id.linear74);
		linear79 = findViewById(R.id.linear79);
		linear88 = findViewById(R.id.linear88);
		linear84 = findViewById(R.id.linear84);
		linear91 = findViewById(R.id.linear91);
		linear95 = findViewById(R.id.linear95);
		linear99 = findViewById(R.id.linear99);
		linear103 = findViewById(R.id.linear103);
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
		imageview14 = findViewById(R.id.imageview14);
		linear85 = findViewById(R.id.linear85);
		linear86 = findViewById(R.id.linear86);
		textview24 = findViewById(R.id.textview24);
		imageview15 = findViewById(R.id.imageview15);
		linear92 = findViewById(R.id.linear92);
		linear93 = findViewById(R.id.linear93);
		textview25 = findViewById(R.id.textview25);
		imageview16 = findViewById(R.id.imageview16);
		linear96 = findViewById(R.id.linear96);
		linear97 = findViewById(R.id.linear97);
		textview26 = findViewById(R.id.textview26);
		imageview17 = findViewById(R.id.imageview17);
		linear100 = findViewById(R.id.linear100);
		linear101 = findViewById(R.id.linear101);
		textview27 = findViewById(R.id.textview27);
		imageview18 = findViewById(R.id.imageview18);
		linear104 = findViewById(R.id.linear104);
		linear105 = findViewById(R.id.linear105);
		textview28 = findViewById(R.id.textview28);
		
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
				i.setClass(getApplicationContext(), One_1Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), Two_2Activity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), ThreeActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), FouActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), SexActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), SavemActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), EitActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), NinActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear88.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), TemActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear84.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), ElvenActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear91.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), TwolActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear95.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), ErdkActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear99.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), BelaActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear103.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), TulsiActivity.class);
				startActivity(i);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear44.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear49.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear54.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear64.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear74.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear71.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear88.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear84.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear91.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear95.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear99.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear103.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		imageview2.setVisibility(View.INVISIBLE);
	}
	
	@Override
	public void onBackPressed() {
		i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
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