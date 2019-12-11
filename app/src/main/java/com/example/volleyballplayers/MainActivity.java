package com.example.volleyballplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<Players>arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);





        Players zehragunes=new Players("Zehra Güneş","1999","197CM","Orta Oyuncu","Türkiye",R.drawable.zehragunes,R.drawable.turkiye);
        Players gizemorge =new Players("Gizem Örge","1993","170CM","Libero","Türkiye",R.drawable.gizemorge,R.drawable.turkiye);
        Players cansuozbay =new Players("Cansu Özbay","1996","182CM","Pasör","Türkiye",R.drawable.cansuozbay,R.drawable.turkiye);
        Players ebrarkarakurt =new Players("Ebrar Karakurt","2000","190CM","Pasör Çaprazı","Türkiye",R.drawable.ebrarkarakurt,R.drawable.turkiye);
        Players gabrielabragaguimaraes=new Players("Gabriela Braga Guimaraes","1994","180CM","Smaçör","Brezilya",R.drawable.gabrielabragaguimaraes,R.drawable.brazilya);
        Players gözdeyilmaz=new Players("Gözde Yılmaz","1991","195CM","Pasör Çaprazı",  "Türkiye",R.drawable.gozdeyilmaz,R.drawable.turkiye);
        Players isabellehaak=new Players("Isabelle Haak","1999","194CM","Pasör Çaprazı","İsveç",R.drawable.isabellehaak,R.drawable.isvec);
        Players majaognjenovic=new Players("Maja Ognjenovic","1994","197CM","Orta Oyuncu","Türkiye",R.drawable.majaognjenovic,R.drawable.sirbistan);
        Players melihaismailoglu=new Players("Meliha İsmailoğlu","1993","189CM","Smaçör","Türkiye",R.drawable.melihaismailoglu,R.drawable.turkiye);
        Players melisgurkaynak=new Players("Melis Gürkaynak","1990","185CM","Orta Oyuncu","Türkiye",R.drawable.melisgurkaynak,R.drawable.turkiye);
        Players pinarerenatasever=new Players("Pınar Eren Atasever","1986","170CM","Libero","Türkiye",R.drawable.pinarerenatasever,R.drawable.turkiye);
        Players milenarasic=new Players("Melina Rasic","1990","193CM","Orta Oyuncu","Sirbistan",R.drawable.milenarasic,R.drawable.sirbistan);
        Players kubraakman=new Players("Kübra Akman","1994","197CM","Orta Oyuncu","Türkiye",R.drawable.kubraakman,R.drawable.turkiye);

        arrayList=new ArrayList<>();

        arrayList.add(zehragunes);
        arrayList.add(gizemorge);
        arrayList.add(cansuozbay);
        arrayList.add(ebrarkarakurt);
        arrayList.add(gabrielabragaguimaraes);
        arrayList.add(gözdeyilmaz);
        arrayList.add(isabellehaak);
        arrayList.add(majaognjenovic);
        arrayList.add(melihaismailoglu);
        arrayList.add(melisgurkaynak);
        arrayList.add(pinarerenatasever);
        arrayList.add(milenarasic);
        arrayList.add(kubraakman);


        customAdapter customAdapter=new customAdapter(arrayList,MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Intent intent=new Intent(MainActivity.this,properties.class);
        intent.putExtra("key",arrayList.get(i));
        startActivity(intent);
            }
        });
    }
}
