package com.lambdaschool.congressdata.vm

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.lambdaschool.congressdata.CongresspersonProfile
import com.lambdaschool.congressdata.ProfileRepository

class CongresspersonProfileViewModel(var id: String?) : ViewModel() {
    var profile: LiveData<CongresspersonProfile>? = null
    get() {
        return if (field == null) {
            loadProfile()
        } else {
            field
        }
    }

    private fun loadProfile(): LiveData<CongresspersonProfile>? {
        profile = ProfileRepository.getProfile(id)
        return profile
    }
}
