package com.example.foodzone.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.foodzone.R
import com.example.foodzone.Variables
import com.example.foodzone.adapter.HomeAdapter
import com.example.foodzone.model.RestaurantData
import org.json.JSONObject


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
     lateinit var layoutManager: LinearLayoutManager
     lateinit var homeAdapter: HomeAdapter
     lateinit var homeRecyclerView: RecyclerView

     val itemList= arrayListOf<RestaurantData>( RestaurantData("djfla","Biryani Wala",200),
                                                RestaurantData("dkf","Muglai Cafe",400),
                                                        RestaurantData("dkf","Chinese Food Point",200),
             RestaurantData("dkf","The Indian Restuarant",250)

     )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_home, container, false )
        homeAdapter= HomeAdapter(activity as Context,itemList)
        layoutManager=LinearLayoutManager(activity)
        homeRecyclerView=view.findViewById(R.id.homeRV)

        homeRecyclerView.adapter=homeAdapter
        homeRecyclerView.layoutManager=layoutManager




        val requestQueue=Volley.newRequestQueue(activity)


        val jsonObjectRequest=object :JsonObjectRequest(Request.Method.GET, Variables.url,
            null, Response.Listener {

                print("Response: $it")
            },
            Response.ErrorListener {
                print("error : $it")
            }
        )
        {
            override fun getHeaders(): MutableMap<String, String> {
                val headers=HashMap<String,String>()
                headers["Content-Type"]="application/json"
                headers["token"]="9bf534118365f1"

                return headers
            }

        }

        requestQueue.add(jsonObjectRequest)







        return view


    }





    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}