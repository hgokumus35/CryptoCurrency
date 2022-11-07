package com.loodos.cryptocurrency.ui.market

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.loodos.cryptocurrency.R
import com.loodos.cryptocurrency.databinding.FragmentMarketBinding
import com.loodos.cryptocurrency.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MarketFragment: Fragment() {

    private val binding by viewBinding(FragmentMarketBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_market, container, false)
    }
}