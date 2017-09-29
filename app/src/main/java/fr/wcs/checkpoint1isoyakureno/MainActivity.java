package fr.wcs.checkpoint1isoyakureno;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextNom=(EditText)findViewById(R.id.editTextNom);
        final EditText editTextPrenom=(EditText)findViewById(R.id.editTextPrenom);
        final EditText editTextEcole=(EditText)findViewById(R.id.editTextEcole);
        final EditText editTextLangage=(EditText)findViewById(R.id.editTextLangage);
        Button buttonEnvoyer=(Button)findViewById(R.id.buttonEnvoyer);
        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String prenom=editTextPrenom.getText().toString();
                String nom=editTextNom.getText().toString();
                String ecole=editTextEcole.getText().toString();
                String langage=editTextLangage.getText().toString();
                if(prenom.equals("")||nom.equals("")||ecole.equals("")||langage.equals("")){
                    Context context=MainActivity.this;
                    CharSequence text="Merci de renseigner tous les champs du formulaire.";
                    int duration=Toast.LENGTH_SHORT;
                    Toast.makeText(context,text,duration).show();
                }else{
                    Intent toStudentActivity=new Intent(MainActivity.this,StudentActivity.class);
                    StudentModel newStudent=new StudentModel(prenom,nom,ecole,langage);
                    toStudentActivity.putExtra("NEWSTUDENT",newStudent);
                    startActivity(toStudentActivity);
                }
            }
        });
    }
}
