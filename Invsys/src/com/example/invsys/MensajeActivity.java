package com.example.invsys;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.invsys.*;
import com.example.invsys.model.Book;
import com.example.invsys.sqlite.MySQLiteHelper;

public class MensajeActivity extends Activity {
	
	TextView textoMensaje;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mensaje);
		
		textoMensaje = (TextView) findViewById(R.id.TxtMensaje);
		
		Bundle bundle = getIntent().getExtras();
		String nombre = bundle.getString("NOMBRE");
		
		MySQLiteHelper db = new MySQLiteHelper(this);
		
		db.addBook(new Book(nombre,"something"));
		
		List<Book> list = db.getAllBooks();
		//db.deleteBook(list.get(0));
		 
		
		String lista = "";
		
		for (Book libro : list){
			db.deleteBook(libro);
			lista += libro.getTitle();
		} 
		
		textoMensaje.setText(lista);
	}

}
