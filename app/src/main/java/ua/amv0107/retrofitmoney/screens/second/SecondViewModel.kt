package ua.amv0107.retrofitmoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ua.amv0107.retrofitmoney.data.repository.Repository
import ua.amv0107.retrofitmoney.model.beznal.Beznal
import ua.amv0107.retrofitmoney.model.nal.Nalichka

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBezNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}