package myapplication.ritstar.com.tictac;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Homeactivity extends AppCompatActivity {
    int turn;
    boolean end;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.replay);
        b11 = (Button) findViewById(R.id.about);

        b1.setText(" ");
        b1.setTextSize(48);
        b2.setText(" ");
        b2.setTextSize(48);
        b3.setText(" ");
        b3.setTextSize(48);
        b4.setText(" ");
        b4.setTextSize(48);
        b5.setText(" ");
        b5.setTextSize(48);
        b6.setText(" ");
        b6.setTextSize(48);
        b7.setText(" ");
        b7.setTextSize(48);
        b8.setText(" ");
        b8.setTextSize(48);
        b9.setText(" ");
        b9.setTextSize(48);


        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endgame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endgame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endgame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endgame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endgame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endgame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endgame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endgame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals(" ")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endgame();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Homeactivity.this);
                builder.setTitle("About");
                builder.setMessage("This App is made by - Ritesh Jha (RitstaR)");
                builder.setIcon(android.R.drawable.ic_dialog_info);
                builder.show();

            }
        });

    }

    public void endgame() {
        String a, b, c, d, e, f, g, h, i;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }

        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }

        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(Homeactivity.this, "Winner Player X !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }

        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(Homeactivity.this, "Winner Player O !", Toast.LENGTH_LONG).show();
            end = true;

        }
        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }
    }
}
