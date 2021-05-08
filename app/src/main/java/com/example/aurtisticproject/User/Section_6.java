package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aurtisticproject.R;
import com.example.aurtisticproject.User.QuizPop;

import java.text.DecimalFormat;

public class Section_6 extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4, rb5;//, rb6, rb7;
    public static double CS = 0.0 ;
    int i;

    String questions[] = {
            "1. Do you prefer to play individual games and sports like golf, where everyone works for themselves, instead of team sports and games where everyone works toward a common goal?",
            "2. Do people say that you speak like a robot?",
            "3. Think about your daily routine. Would you say you follow the same schedule every day of the week, and don’t like unexpected events",
            "4. Are you always bumping into things, or tripping over your own feet",
            "5. Do you enjoy inventing your own words and expressions that might seem quirky to others",
            "6. Do you prefer to read non-fiction over fiction books",
            "7. Are expressions like “Curiosity killed the cat” or “Don’t count your chickens before they hatch” odd to you",
            "8. Are you really (really) good at a skill like math or music, but struggle to succeed in other areas",
            "9. Do your family members lovingly refer to you as the “eccentric professor” of the family, even though you don’t work anywhere near academia",
            "10. Is your memory like a steel trap, even for facts that you don’t fully understand",
            "11. Are you always the first one to notice when a friend has gotten a haircut or made a small change to their appearance",
            "12. Do you have trouble understanding what people mean when they say they feel embarrassed for someone else",
            "13. Do you talk to friends at a party the same way you would talk to co-workers in the office",
            "14. When you’re having a conversation with someone, do you prefer to look at the wall, their shoes, or anywhere but directly into their eyes",
            "15. Even when you’re in a quiet place, like the library, do you find yourself making involuntary noises, like clearing your throat over and over",
            "16. Have you always wanted a best friend, but never found one",
            "17. Did bullies target you in grade school",
            //questions for minor category below
            "1. Does your child have limited speech (non-verbal or speaks in only short phrases)",
            "2. Does your child tend to give random answers to questions, or make random comments",
            "3. Does your child not respond to their name",
            "4. Does your child avoid eye contact",
            "5. Does your child not engage in pretend play with other children",
            "6. Does your child struggle to understand other people's feelings",
            "7. Is your child easily upset by small changes",
            "8. Does your child have obsessive interests",
            "9. Does your child engage in repetitive behaviors such as pacing or lining up of objects",
            "10. Is your child over or under-sensitive to smells, tastes, or touch",
            "11. Does your child struggle to socialize with other children",
            "12. Does your child avoid physical contact",
            "13. Does your child show little awareness of dangerous situations"
    };

//    static String traits[] = {"Fluency", "Flexibility", "Originality", "Elaboration", "Tolerance of Ambiguity", "Breadth of Interest", "Sensitivity", "Curiosity", "Reflection", "Action", "Concentration & Persistence",
//            "Expression of total personality", "Sense of Humour"};
//    static String suggest[] = new String[]{"Think from different perspective", "Apply principle of Creativity and Innovation Such as Inspiration", "Judge uniqueness of ideas for problem solving / welcome bold ideas", "Detail out your ideas from technology and business point of view", "Take stand to establish your thought and check the feasibility of implementation of your idea",
//            "Apply amalgamated knowledge from different allied disciplines", "Improve observational skills and be empathetic", "Try out different approaches to solve the problem and do experiemnt", "Always evaluate ideas before giving solution and provide optimized design solution/Is there any USP of your idea?/ What the the MVP?/ be sensitive towards business innovation or environment or socio-political issues etc.",
//            "Gain implementation skill and knowledge/ ask for help from field expert when your expertise is limited", "Be healthy and well motivated / always try for the best at your time", "Be imaginative as well as logical", "Develop sense of humour / don't loose your comitment"};

//    public  byte[] pos = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12};
    public  int ans[] = new int[30];
    //public static float CT[] = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    /*String fluency[] = {
            "1. I am able to think about different solution for a particular problem",
            "2. I shall come with different solution for a problem assigned to me",
            "3. I resolve problems with solutions thought from different perspectives"
    };

    String flexibility[] = {
            "4. I am able to come up with ideas which are different",
            "5. I am able to come up with ideas which are not related to traditional solutions",
            "6. I can visualize the unusual uses of a product / system"
    };

    String originality[] = {
            "7. I do divergent thinking to provide solution for a problem",
            "8. I am generally going beyond commonly accepted ideas to unusual forms for a design solution",
            "9. I am generally going beyond commonly accepted approaches for a design solution"
    };

    String elaboration[] = {
            "10. I usually go for more number of details to extend a design solution",
            "11. I don't provide a design solution superficially or casually"
    };

    String tolerance_of_ambiguity[] = {
            "12. I am able to hold conflicting ideas and values",
            "13. I am able to take the action of making one view or belief compatible with another"
    };

    String breadth_of_interest[] = {
            "14. I generally take interest on multidisciplinary knowledge gaining and its application for problem solving",
            "15. I believe in implications of interdisciplinary/ multidisciplinary knowledge rather than for small details and facts for the sake of facts"
    };

    String sensitivity[] = {
            "16. I am  able to identify needs in life and fill these needs",
            "17. I sense problems / deficiencies in life and find solutions",
            "18. I consider thoughts and feelings of others when solving problems"
    };

    String curiosity[] = {
            "19. I am very open for new ideas and experiences",
            "20. I have the capacity to be puzzled",
            "21. I am actively experimenting with ideas and the pleasure in seeking and discovering ideas"
    };

    String reflection[] = {
            "22. I consider and reconsider ideas for solutions of a problem",
            "23. I evaluate my ideas as well as the ideas of others before proposing best solution to a problem",
            "24. I take time to achieve understanding and insights",
            "25. I usually look ahead and plan for a solution to provided problem",
            "26. I take an overview of  the selected solution (s) and think about different consequences (e.g. business, plicy level, political etc.)"
    };

    String action[] = {
            "27. I have ability to put ideas in action with high energy level",
            "28. I am able to implement the planned solution to a problem with great enthusiasm"
    };

    String concentration_and_persistence[] = {
            "29. I am able to work hard as long as I provide high quality design solution",
            "30. I am able to work consistently and persistently with extraordinary concentration to provide solutions to a problem"
    };

    String expression_of_tp[] = {
            "31. I am imaginative and have ability to come with unique thoughts",
            "32. I am able to think logically during problem solving",
            "33. I take independent decision based on self-reliance during problem solving"
    };

    String sense_of_humour[] = {
            "34. I have ability to see and express the humour in the contradictions and ambiguities of life",
            "35. I maintain a balance without losing commitment during design solution"
    };*/


    String opt[] = {
            "Never", "Rarely", "Sometimes", "Often", "Very Often"
    };
    int flag = 0;

    public static int j = 0, c = 0;

    int x=0,y=17;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_6);

//        final TextView score = (TextView) findViewById(R.id.textView4);
        TextView textView = (TextView) findViewById(R.id.DispName);
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("myname");


        textView.setText("Rate yourself accordingly in the following questions");

        submitbutton = (Button) findViewById(R.id.button3);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.tvque);
        if(QuizPop.valid)
        {
            y=13;
            x=17;
            flag=17;
        }


        radio_g = (RadioGroup) findViewById(R.id.answersgrp);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
//        rb6 = (RadioButton) findViewById(R.id.radioButton6);
//        rb7 = (RadioButton) findViewById(R.id.radioButton7);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        rb5.setText(opt[4]);


        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if (radio_g.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                String sup[]=ansText.split(" ");
//                int m = Integer.parseInt(sup[0]);
                int m=0;
                for (int i = 0; i < opt.length ; i++)
                {
                    if(ansText.equals(opt[i])){
                        m=i+1;
                        break;
                    }
                }

                ans[flag++]=m;
//                CT[pos[flag]]= CT[pos[flag]] + answers[flag];
//                c++;
//                if(pos[flag] != j)
//                {
//                    j++;
//                    CT[flag-1]= CT[flag-1]/(c*1.0f);
//                    CS= CS + CT[flag-1];
//                    c=0;
//                }
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
//                if(ansText.equals(answers[flag])) {
//                    correct++;
//                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    wrong++;
//                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
//                }

//                flag++;
//
//                if (score != null)
//                score.setText(""+m);

                if (flag <  questions.length) {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[0]);
                    rb2.setText(opt[1]);
                    rb3.setText(opt[2]);
                    rb4.setText(opt[3]);
                    rb5.setText(opt[4]);

                } else {
                    for (int i = x; i < 30 ; i++)
                    {
                        CS = CS + ans[i];
                    }
                    CS = CS /y;
//                    for (i = 0; i < pos.length; i++) {
//                        if (pos[i] == j) {
//                            CT[j] = CT[j] + ans[i];
//                            c++;
//                        } else {
//                            CT[j] = (CT[j++]*1.0f)/ (c * 1.0f);
//                            c = 0;
//                            i--;
//                        }
//                    }
//                    CT[j]=CT[j]/((c)*1.0f);
//                    for (i = 0; i < 13; i++) {
//                        DecimalFormat df = new DecimalFormat("###.##");
////                        Login.ct = Login.ct + df.format(CT[i]) + " ";
//                        CS = Double.valueOf(df.format(CT[i])) + CS;
//                    }
//                    Login.ct = Login.ct + "_";
//                    DecimalFormat df = new DecimalFormat("###.##");
//                    String st = " "+ df.format(CS);
//                    Login.cs = Login.cs + " " + st;
                    i= 0; j =0; //CS = 0;
                    Intent into = new Intent(getApplicationContext(), QuizResult.class);
                    startActivity(into);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserDashboard.class);
                startActivity(intent);
               // Section_6.super.onBackPressed();
            }
        });
    }
}
