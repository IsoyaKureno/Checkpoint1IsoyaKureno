package fr.wcs.checkpoint1isoyakureno;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        StudentModel reçu=getIntent().getExtras().getParcelable("NEWSTUDENT");
        String prenom=reçu.getFirstname();
        String nom=reçu.getLastname();
        String ecole=reçu.getSchool();
        String langage=reçu.getLanguage();
        TextView textViewFirstname=(TextView)findViewById(R.id.textViewFirstname);
        TextView textViewLastname=(TextView)findViewById(R.id.textViewLastname);
        TextView textViewSchool=(TextView)findViewById(R.id.textViewSchool);
        TextView textViewLanguage=(TextView)findViewById(R.id.textViewLanguage);
        textViewFirstname.setText(prenom);
        textViewLastname.setText(nom);
        textViewSchool.setText(ecole);
        textViewLanguage.setText(langage);
    }
}
