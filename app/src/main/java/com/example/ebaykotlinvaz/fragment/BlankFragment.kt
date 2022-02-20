package com.example.ebaykotlinvaz.fragment

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.Display
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlinvaz.FirstListner
import com.example.ebaykotlinvaz.R
import com.example.ebaykotlinvaz.activity.MainActivity
import com.example.ebaykotlinvaz.adapter.AirPodsAdapter
import com.example.ebaykotlinvaz.adapter.BraveAdapter
import com.example.ebaykotlinvaz.adapter.FavoriteAdapter
import com.example.ebaykotlinvaz.model.AirPods
import com.example.ebaykotlinvaz.model.Brave
import com.example.ebaykotlinvaz.model.Favorite

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root: View
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView_air_pods: RecyclerView
    lateinit var recyclerView_brave: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_blank, container, false)

        initViews()

        initViews_air()

        initViews_brave()

        return root
    }

    private fun initViews_brave() {
        recyclerView_brave = root.findViewById(R.id.recyclerView_brave)

        braveAdapter(getAllBrave())
    }

    private fun braveAdapter(items: ArrayList<Brave>) {
        val adapter = BraveAdapter(requireContext(), items)
        recyclerView_brave.adapter = adapter
    }

    private fun getAllBrave(): ArrayList<Brave> {
        var items = ArrayList<Brave>()

        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))
        items.add(Brave(R.drawable.brave_1, "Blankets"))

        return items
    }

    private fun initViews_air() {
        recyclerView_air_pods = root.findViewById(R.id.recyclerView_air_pods)
        recyclerView_air_pods.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        airPodsAdapter(getAllAirPods())
    }

    private fun airPodsAdapter(items: ArrayList<AirPods>) {
        var adapter = AirPodsAdapter(requireContext(), items)
        recyclerView_air_pods.adapter = adapter
    }

    private fun getAllAirPods(): ArrayList<AirPods> {
        var items = ArrayList<AirPods>()
        items.add(AirPods(R.drawable.air_pods_1, "Apple AirPods 2.2", "1 600 000", "1 991 000 20"))
        items.add(AirPods(R.drawable.air_pods_2, "Apple AirPods Pro Wireless Headphones", "2 362 326", "2 853 050 17.2"))
        items.add(AirPods(R.drawable.air_pods_3, "AirPods 2nd", "129 $", "180$ 28.3"))
        items.add(AirPods(R.drawable.air_pods_4, "Apple AirPods 2.2", "239 $", "290 $ 17.6"))
        items.add(AirPods(R.drawable.air_pods_1, "Apple AirPods 2.2", "1 600 000", "1 991 000 20"))
        items.add(AirPods(R.drawable.air_pods_2, "Apple AirPods Pro Wireless Headphones", "2 362 326", "2 853 050 17.2"))
        items.add(AirPods(R.drawable.air_pods_3, "AirPods 2nd", "129 $", "180$ 28.3"))
        items.add(AirPods(R.drawable.air_pods_4, "Apple AirPods 2.2", "239 $", "290 $ 17.6"))
        items.add(AirPods(R.drawable.air_pods_1, "Apple AirPods 2.2", "1 600 000", "1 991 000 20"))
        items.add(AirPods(R.drawable.air_pods_2, "Apple AirPods Pro Wireless Headphones", "2 362 326", "2 853 050 17.2"))
        items.add(AirPods(R.drawable.air_pods_3, "AirPods 2nd", "129 $", "180$ 28.3"))
        items.add(AirPods(R.drawable.air_pods_4, "Apple AirPods 2.2", "239 $", "290 $ 17.6"))

        return items
    }

    private fun initViews() {
        recyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager =LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,  false)

        refreshAdapter(getAllFavorite())
    }

    private fun refreshAdapter(items: ArrayList<Favorite>) {
        var adapter = FavoriteAdapter(requireContext(), items)
        recyclerView.adapter = adapter
    }

    private fun getAllFavorite(): ArrayList<Favorite> {
        var items = ArrayList<Favorite>()
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))
        items.add(Favorite("Apple Watch", R.drawable.watch_1))

        return items
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}