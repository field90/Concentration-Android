package org.conc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//this is where the game happens
public class Game extends Activity implements OnClickListener
{
	private Button buttonA1;
	private Button buttonA2;
	private Button buttonA3;
	private Button buttonA4;
	private Button buttonB1;
	private Button buttonB2;
	private Button buttonB3;
	private Button buttonB4;
	private Button buttonC1;
	private Button buttonC2;
	private Button buttonC3;
	private Button buttonC4;
	private Button choice1;
	private Button choice2;
	private Button reset;
	private Model model;
	private int cardNum=1;
	private int turn=1; 
	private TextView turnDisplay;
	private Context context;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.game);
	        //View mStartButton = findViewById(R.id.startButton);
	        //mStartButton.setOnClickListener(this);
	        context = getApplicationContext();
	       
	        model = new Model();
	        buttonA1= (Button) findViewById(R.id.button1);
	        buttonA1.setOnClickListener(this);
	        buttonA2= (Button) findViewById(R.id.button2);
	        buttonA2.setOnClickListener(this);
	        buttonA3= (Button) findViewById(R.id.button3);
	        buttonA3.setOnClickListener(this);
	        buttonA4= (Button) findViewById(R.id.button10);
	        buttonA4.setOnClickListener(this);
 	        buttonB1= (Button) findViewById(R.id.button4);
	        buttonB1.setOnClickListener(this);
	        buttonB2= (Button) findViewById(R.id.button5);
	        buttonB2.setOnClickListener(this);
	        buttonB3= (Button) findViewById(R.id.button6);
	        buttonB3.setOnClickListener(this);
	        buttonB4= (Button) findViewById(R.id.button11);
	        buttonB4.setOnClickListener(this);
	        buttonC1= (Button) findViewById(R.id.button7);
	        buttonC1.setOnClickListener(this);
	        buttonC2= (Button) findViewById(R.id.button8);
	        buttonC2.setOnClickListener(this);
	        buttonC3= (Button) findViewById(R.id.button9);
	        buttonC3.setOnClickListener(this);
	        buttonC4= (Button) findViewById(R.id.button12);
	        buttonC4.setOnClickListener(this);
	        reset= (Button) findViewById(R.id.button13);
	        reset.setOnClickListener(this);
	        turnDisplay= (TextView) findViewById(R.id.turnView);
	      
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
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId())
		{
			case R.id.button1:
				buttonA1.setText(model.entityList.get(0));
				if(cardNum ==1)
				{
					choice1=buttonA1;
					cardNum++;
				}
				else
				{
					choice2=buttonA1;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button2:
				buttonA2.setText(model.entityList.get(1));
				if(cardNum ==1)
				{
					choice1=buttonA2;
					cardNum++;
				}
				else
				{
					choice2=buttonA2;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button3:
				buttonA3.setText(model.entityList.get(2));
				if(cardNum ==1)
				{
					choice1=buttonA3;
					cardNum++;
				}
				else
				{
					choice2=buttonA3;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button10:
				buttonA4.setText(model.entityList.get(9));
				if(cardNum ==1)
				{
					choice1=buttonA4;
					cardNum++;
				}
				else
				{
					choice2=buttonA4;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button4:
				buttonB1.setText(model.entityList.get(3));
				if(cardNum ==1)
				{
					choice1=buttonB1;
					cardNum++;
				}
				else
				{
					choice2=buttonB1;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button5:
				buttonB2.setText(model.entityList.get(4));
				if(cardNum ==1)
				{
					choice1=buttonB2;
					cardNum++;
				}
				else
				{
					choice2=buttonB2;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button6:
				buttonB3.setText(model.entityList.get(5));
				if(cardNum ==1)
				{
					choice1=buttonB3;
					cardNum++;
				}
				else
				{
					choice2=buttonB3;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button11:
				buttonB4.setText(model.entityList.get(10));
				if(cardNum ==1)
				{
					choice1=buttonB4;
					cardNum++;
				}
				else
				{
					choice2=buttonB4;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button7:
				buttonC1.setText(model.entityList.get(6));
				if(cardNum ==1)
				{
					choice1=buttonC1;
					cardNum++;
				}
				else
				{
					choice2=buttonC1;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button8:
				buttonC2.setText(model.entityList.get(7));
				if(cardNum ==1)
				{
					choice1=buttonC2;
					cardNum++;
				}
				else
				{
					choice2=buttonC2;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button9:
				buttonC3.setText(model.entityList.get(8));
				if(cardNum ==1)
				{
					choice1=buttonC3;
					cardNum++;
				}
				else
				{
					choice2=buttonC3;
					compCard(choice1,choice2);
					turn++;
				}
				break;
			case R.id.button12:
				buttonC4.setText(model.entityList.get(11));
				if(cardNum ==1)
				{
					choice1=buttonC4;
					cardNum++;
				}
				else
				{
					choice2=buttonC4;
					compCard(choice1,choice2);
					turn++;
				}
				break;
				//resets the game 
			case R.id.button13:
				finish();
				Intent x=new Intent(this, Game.class);
				startActivity(x);
				break;
				
		}
		
	}
	private void compCard(Button choice1, Button choice2) {
		// TODO Auto-generated method stub
		
		//gets if the 2 cards match
		
		turnDisplay.setText(turn+" ");
		if(model.answerMap.get(choice1.getText())==choice2.getText()||
			model.answerMap.get(choice2.getText())==choice1.getText())
		{
			
	    	int duration = Toast.LENGTH_SHORT;
	    	choice1.setVisibility(Button.GONE);
	    	choice2.setVisibility(Button.GONE);
	    	Toast toast = Toast.makeText(context, ""+choice1.getText() + " and " + choice2.getText() + " are a match",duration);
	    	Toast toast2 = Toast.makeText(context, "Boom Headshot!", duration);
	    	toast.show();
			cardNum=1;
		}
		else
		{
			
			int duration=Toast.LENGTH_LONG;
			Toast toast = Toast.makeText(context, ""+choice1.getText() + " and " + choice2.getText() + " are not a match ",duration);
			toast.show();
			choice1.setText("");
			choice2.setText("");
			cardNum=1;
		}
	}
}
