package com.ayurvedic.hex;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;
import android.content.pm.PackageManager;

public class HomeActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> m = new HashMap<>();
	private String uri = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private ImageView imageview12;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear8;
	private LinearLayout linear44;
	private LinearLayout linear54;
	private LinearLayout linear59;
	private LinearLayout linear89;
	private LinearLayout linear69;
	private LinearLayout linear79;
	private LinearLayout linear84;
	private ImageView imageview1;
	private LinearLayout linear9;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview2;
	private ImageView imageview2;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private TextView textview4;
	private ImageView imageview4;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private TextView textview8;
	private ImageView imageview5;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private TextView textview10;
	private ImageView imageview11;
	private LinearLayout linear90;
	private LinearLayout linear91;
	private LinearLayout linear92;
	private TextView textview20;
	private ImageView imageview7;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private TextView textview14;
	private ImageView imageview9;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private LinearLayout linear82;
	private TextView textview18;
	private ImageView imageview10;
	private LinearLayout linear85;
	private LinearLayout linear86;
	private LinearLayout linear87;
	private TextView textview19;
	
	private Intent i = new Intent();
	private DatabaseReference USER = _firebase.getReference("DATA");
	private ChildEventListener _USER_child_listener;
	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview12 = findViewById(R.id.imageview12);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		linear8 = findViewById(R.id.linear8);
		linear44 = findViewById(R.id.linear44);
		linear54 = findViewById(R.id.linear54);
		linear59 = findViewById(R.id.linear59);
		linear89 = findViewById(R.id.linear89);
		linear69 = findViewById(R.id.linear69);
		linear79 = findViewById(R.id.linear79);
		linear84 = findViewById(R.id.linear84);
		imageview1 = findViewById(R.id.imageview1);
		linear9 = findViewById(R.id.linear9);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		textview2 = findViewById(R.id.textview2);
		imageview2 = findViewById(R.id.imageview2);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		textview4 = findViewById(R.id.textview4);
		imageview4 = findViewById(R.id.imageview4);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		textview8 = findViewById(R.id.textview8);
		imageview5 = findViewById(R.id.imageview5);
		linear60 = findViewById(R.id.linear60);
		linear61 = findViewById(R.id.linear61);
		linear62 = findViewById(R.id.linear62);
		textview10 = findViewById(R.id.textview10);
		imageview11 = findViewById(R.id.imageview11);
		linear90 = findViewById(R.id.linear90);
		linear91 = findViewById(R.id.linear91);
		linear92 = findViewById(R.id.linear92);
		textview20 = findViewById(R.id.textview20);
		imageview7 = findViewById(R.id.imageview7);
		linear70 = findViewById(R.id.linear70);
		linear71 = findViewById(R.id.linear71);
		linear72 = findViewById(R.id.linear72);
		textview14 = findViewById(R.id.textview14);
		imageview9 = findViewById(R.id.imageview9);
		linear80 = findViewById(R.id.linear80);
		linear81 = findViewById(R.id.linear81);
		linear82 = findViewById(R.id.linear82);
		textview18 = findViewById(R.id.textview18);
		imageview10 = findViewById(R.id.imageview10);
		linear85 = findViewById(R.id.linear85);
		linear86 = findViewById(R.id.linear86);
		linear87 = findViewById(R.id.linear87);
		textview19 = findViewById(R.id.textview19);
		auth = FirebaseAuth.getInstance();
		d = new AlertDialog.Builder(this);
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), SymptomActivity.class);
				startActivity(i);
			}
		});
		
		linear44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), DiagnosisActivity.class);
				startActivity(i);
			}
		});
		
		linear54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), PlantsActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), BmiActivity.class);
				startActivity(i);
			}
		});
		
		linear89.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.google.com/maps/search/ayurvedic+hospital+near+me/"));
				startActivity(i);
			}
		});
		
		linear69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("mailto:".concat("snehakalaiselvan2603@gmail.com")));
				i.putExtra("Intent.EXTRA_SUBJECT", "Feedback");
				startActivity(i);
			}
		});
		
		linear79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				i.setClass(getApplicationContext(), DeveloperActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		linear84.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				uri = "com.ayurvedic.hex";
				String apk = "";
				try { 
					android.content.pm.PackageInfo pi = getPackageManager().getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES); 
					apk = pi.applicationInfo.publicSourceDir; 
				}
				catch (Exception e) {
					Toast.makeText(getApplicationContext(), "An error occurred",
					   Toast.LENGTH_LONG).show(); 
				}
				StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build()); 
				Intent intent = new Intent(Intent.ACTION_SEND); 
				intent.setType("*/*"); 
				intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(apk))); 
				
				startActivity(Intent.createChooser(intent, "Ayurvedic Upchar"));
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_USER_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {
					textview1.setText(_childValue.get("Name").toString());
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		USER.addChildEventListener(_USER_child_listener);
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		textview2.setText("Symptom Checker");
		
		textview4.setText("Diagnosis");
		
		textview8.setText("Herbal Plant");
		
		textview10.setText("BMI Calculator");
		
		textview14.setText("Feedback");
		
		textview18.setText("About Developer");
		
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear44.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear54.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear59.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear89.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear69.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear79.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
		linear84.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFFD3D3D3));
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	
	
	@Override
	public void onBackPressed() {
		d.setTitle("DO YOU WANT TO EXIT?");
		d.setPositiveButton("YES", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		d.setNegativeButton("NO", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
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