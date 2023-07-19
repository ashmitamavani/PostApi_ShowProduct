package com.example.postapi_showproduct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
         ArrayList<Productdata_Model>productdata=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        RequestQueue queue= Volley.newRequestQueue(MainActivity.this);
        String url="https://amiparaandroid.000webhostapp.com/Myapp/showAllproducts.php";

        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject object = new JSONObject(response);
                            JSONArray jsonArray = object.getJSONArray("productdata");

                            for (int i = 0; i < jsonArray.length(); i++) {

                              JSONObject productobj=jsonArray.getJSONObject(i);
                               String ID=productobj.getString("ID");
                               String UID=productobj.getString("UID");
                               String PRO_NAME=productobj.getString("PRO_NAME");
                               String PRO_DES=productobj.getString("PRO_DES");
                               String PRO_PRICE=productobj.getString("PRO_PRICE");
                               String PRO_IMAGE=productobj.getString("PRO_IMAGE");
                               Productdata_Model productData = new Productdata_Model(ID,UID,PRO_NAME,PRO_PRICE,PRO_IMAGE,PRO_DES);
                               productdata.add(productData);
                            }
                            Recyclerview_Adapter adapter=new Recyclerview_Adapter(MainActivity.this,productdata);
                            recyclerView.setAdapter(adapter);
                            Log.d("AAA", "getParams: showdata"+productdata.get(0));

                            } catch(JSONException e){
                                throw new RuntimeException(e);
                            }

                        }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() {
                // below line we are creating a map for
                // storing our values in key and value pair.
                Map<String, String> params = new HashMap<String, String>();
                params.put("UID","1");
                //Log.d("AAA", "getParams: showdata"+params);
                // on below line we are passing our key
                // and value pair to our parameters.


                // at last we are
                // returning our params.
                return params;
            }
        };
        queue.add(request);
    }
}