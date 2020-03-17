package com.lambdaschool.congressdata.vm

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.lambdaschool.congressdata.OfficialOverview
import com.lambdaschool.congressdata.OverviewListRepository

import java.util.ArrayList

class CongresspersonListViewModel : ViewModel() {
    var overviewList: LiveData<ArrayList<OfficialOverview>>? = null
    get() {
        if (field == null) {
            loadList()
        }
        return field
    }

    private fun loadList(): LiveData<ArrayList<OfficialOverview>>? {
        overviewList = OverviewListRepository.overviewList
        return overviewList
    }
}
