package com.example.invsys;
 
import java.util.List;



import com.example.invsys.*;
import com.example.invsys.model.Book;
import com.example.invsys.sqlite.MySQLiteHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;





public class MainActivity extends Activity {
 
	EditText campoNombre;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
        campoNombre = (EditText) findViewById(R.id.TxtNombre);

        MySQLiteHelper db = new MySQLiteHelper(this);
 
        /**
         * CRUD Operations
         * */
        // add Books
        //db.addBook(new Book("Android Application Development Cookbook", "Wei Meng Lee"));   
        //db.addBook(new Book("Android Programming: The Big Nerd Ranch Guide", "Bill Phillips and Brian Hardy"));       
        //db.addBook(new Book("Learn Android App Development", "Wallace Jackson"));
 
        // get all books
        //List<Book> list = db.getAllBooks();
 
        // delete one book
        //db.deleteBook(list.get(0));
 
        // get all books
        //db.getAllBooks();
 
    }
    
	
	public void agregando_nombre(View v) {
		
		String nombre = campoNombre.getText().toString();
		
		Bundle bundle = new Bundle();
		bundle.putString("NOMBRE", nombre);
		
		Intent intencion = new Intent(this, MensajeActivity.class);
		intencion.putExtras(bundle);
		
		startActivity(intencion);
	}
 
}
