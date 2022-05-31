package ua.amv0107.retrofitmoney.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ua.amv0107.retrofitmoney.data.repository.Repository
import ua.amv0107.retrofitmoney.model.nal.Nalichka

class StartViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }
}