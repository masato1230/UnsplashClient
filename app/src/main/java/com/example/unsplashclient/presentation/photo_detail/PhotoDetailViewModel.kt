package com.example.unsplashclient.presentation.photo_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplashclient.common.NetworkResponse
import com.example.unsplashclient.domain.use_case.GetPhotoDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class PhotoDetailViewModel @Inject constructor(
    private val getPhotoDetailUseCase: GetPhotoDetailUseCase,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val _state = mutableStateOf(PhotoDetailState())
    val state: State<PhotoDetailState> = _state

    init {
        savedStateHandle.get<String>("photoId")?.let {  photoId ->
            getPhotoDetail(photoId)
        }
    }

    private fun getPhotoDetail(photoId: String) {
        getPhotoDetailUseCase(photoId).onEach { result ->
            when (result) {
                is NetworkResponse.Success -> {
                    _state.value = PhotoDetailState(photoDetail = result.data)
                }
                is NetworkResponse.Failure -> {
                    _state.value = PhotoDetailState(error = result.error)
                }
                is NetworkResponse.Loading -> {
                    _state.value = PhotoDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}