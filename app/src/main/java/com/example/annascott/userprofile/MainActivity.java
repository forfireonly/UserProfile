package com.example.annascott.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myName, myBirthday, myCountry;
    ImageView myPicture;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
// Initialize a new RelativeLayout
            RelativeLayout rl = new RelativeLayout(getApplicationContext());
            // Create LayoutParams for RelativeLayout
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT
            );

            // Set RelativeLayout LayoutParams
            rl.setLayoutParams(lp);
            // Set a background color for RelativeLayout
            rl.setBackgroundColor(Color.parseColor("#FF2C9DFF"));


            myPicture = new ImageView(getApplicationContext());

            RelativeLayout.LayoutParams lp_picture = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            myPicture.setImageResource(R.drawable.me);
            myPicture.setLayoutParams(lp_picture);
            rl.addView(myPicture);
            myPicture.setId(1);


            // Initialize a new TextView widget
            myName = new TextView(getApplicationContext());

            // Create a LayoutParams for TextView widget
            RelativeLayout.LayoutParams lp_name = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

            // Specify the TextView position in parent layout
            lp_name.addRule(RelativeLayout.BELOW, 1);
            lp_name.addRule(RelativeLayout.CENTER_HORIZONTAL);


            // Add LayoutParams to TextView
            myName.setLayoutParams(lp_name);


            // Set a text for TextView
            myName.setText("Anna Scott");
            myName.setTextSize(30);
            myName.setTypeface(Typeface.DEFAULT_BOLD);
            myName.setTextColor(Color.parseColor("#f29fc5"));
            myName.setId(2);



            // Ad the TextView to RelativeLayout as child View
            rl.addView(myName);


            // Initialize a new TextView widget
            myCountry = new TextView(getApplicationContext());

            // Create a LayoutParams for TextView widget
            RelativeLayout.LayoutParams lp_country = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

            // Specify the TextView position in parent layout
            lp_country.addRule(RelativeLayout.BELOW, 2);
            lp_country.addRule(RelativeLayout.CENTER_HORIZONTAL);


            // Add LayoutParams to TextView
            myCountry.setLayoutParams(lp_country);


            // Set a text for TextView
            myCountry.setText("Shvabrania");
            myCountry.setTextSize(30);
            myCountry.setTypeface(Typeface.DEFAULT_BOLD);
            myCountry.setTextColor(Color.parseColor("#f29fc5"));
            myCountry.setId(3);



            // Ad the TextView to RelativeLayout as child View
            rl.addView(myCountry);


            // Initialize a new TextView widget
            myBirthday = new TextView(getApplicationContext());

            // Create a LayoutParams for TextView widget
            RelativeLayout.LayoutParams lp_birthday = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

            // Specify the TextView position in parent layout
            lp_birthday.addRule(RelativeLayout.BELOW, 3);
            lp_birthday.addRule(RelativeLayout.CENTER_HORIZONTAL);


            // Add LayoutParams to TextView
            myBirthday.setLayoutParams(lp_birthday);


            // Set a text for TextView
            myBirthday.setText("February 10, 1992");
            myBirthday.setTextSize(30);
            myBirthday.setTypeface(Typeface.DEFAULT_BOLD);
            myBirthday.setTextColor(Color.parseColor("#f29fc5"));




            // Ad the TextView to RelativeLayout as child View
            rl.addView(myBirthday);

            // Finally, specify the RelativeLayout is the root content
            setContentView(rl);
        }

   /* public void initialiseViews(){
        myName = (TextView) findViewById(R.id.name);
        myBirthday = (TextView) findViewById(R.id.birthday);
        myCountry = (TextView) findViewById(R.id.country);
        myPicture = (ImageView) findViewById(R.id.profile_picture);
    }

    public void setScreen(){
        myName = (TextView) findViewById(R.id.name);
        myBirthday = (TextView) findViewById(R.id.birthday);
        myCountry = (TextView) findViewById(R.id.country);
        myPicture = (ImageView) findViewById(R.id.profile_picture);

        myName.setText("Anna Scott");
        myBirthday.setText("February 10, 1992");
        myCountry.setText("Shvabrania");
        myPicture.setImageResource(R.drawable.me);
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) myPicture.getLayoutParams();
        lp.addRule(RelativeLayout.BELOW, myName.getId());
        myPicture.setLayoutParams(lp);


    }*/

}
