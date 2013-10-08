package com.nhn.android.mapviewer;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Address extends ListActivity{
       
        
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address);
        ArrayList<Person> m_orders = new ArrayList<Person>();
        
        Person p1 = new Person("안드로이드", "010-123-4567");
        Person p2 = new Person("아이오에스", "010-123-4567");
        
        m_orders.add(p1);
        m_orders.add(p2);
        
        PersonAdapter m_adapter = new PersonAdapter(this, R.layout.row, m_orders);
        setListAdapter(m_adapter);
                
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

    	menu.add("연락처 추가");
    	menu.add("연락처 삭제");
    	
    	return super.onCreateOptionsMenu(menu);

    }




    
    private class PersonAdapter extends ArrayAdapter<Person> {

        private ArrayList<Person> items;

        public PersonAdapter(Context context, int textViewResourceId, ArrayList<Person> items) {
                super(context, textViewResourceId, items);
                this.items = items;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;
                if (v == null) {
                    LayoutInflater vi = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = vi.inflate(R.layout.row, null);
                }
                Person p = items.get(position);
                if (p != null) {
                        TextView tt = (TextView) v.findViewById(R.id.toptext);
                        TextView bt = (TextView) v.findViewById(R.id.bottomtext);
                        if (tt != null){
                        	tt.setText(p.getName());                            
                        }
                        if(bt != null){
                        		bt.setText("전화번호 : "+ p.getNumber());
                        }
                }
                return v;
        }
}
    class Person {
        
        private String Name;
        private String Number;
        
        public Person(String _Name, String _Number){
        	this.Name = _Name;
        	this.Number = _Number;
        }
        
        public String getName() {
            return Name;
        }

        public String getNumber() {
            return Number;
        }

    }
}


