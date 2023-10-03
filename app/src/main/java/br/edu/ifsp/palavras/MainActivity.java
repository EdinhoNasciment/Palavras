package br.edu.ifsp.palavras;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_letras);
        recyclerView.setAdapter(new LetrasAdapter(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem trocarLayoutButton = menu.findItem(R.id.trocar_layout);
        alterarIconeMenu(trocarLayoutButton);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item){

        if(item.getItemId() ==  R.id.trocar_layout){
            alterarLayout();
            alterarIconeMenu(item);
        }

        return super.onOptionsItemSelected(item);
    }

    

}