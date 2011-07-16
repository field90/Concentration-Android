package org.conc;




import org.conc.Game;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class Concentration extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View mStartButton = findViewById(R.id.startButton);
        mStartButton.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId())
		{
			case R.id.startButton:
			Intent x=new Intent(this, Game.class);
			startActivity(x);
		}
	}
	 @Override
	    protected void onResume()
	    {
	    	super.onResume();
	    	  setVolumeControlStream(AudioManager.STREAM_MUSIC);
	          Music.create(this, R.raw.gameover);
	          Music.setLooping(this, R.raw.gameover);
	          Music.start(this);
	    }
	  @Override
	    protected void onPause()
	    {
	    	super.onPause();
	    	Music.stop(this);
	    }
	    @Override
	    protected void onDestroy()
	    {
	    	super.onDestroy();
	    	Music.stop(this);
	    }
}