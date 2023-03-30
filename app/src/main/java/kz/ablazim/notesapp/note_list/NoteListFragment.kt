package kz.ablazim.notesapp.note_list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kz.ablazim.notesapp.R
import timber.log.Timber

class NoteListFragment : Fragment(R.layout.fragment_note_list) {

    private val viewModel: NoteListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("onViewCreated called")
    }
}
