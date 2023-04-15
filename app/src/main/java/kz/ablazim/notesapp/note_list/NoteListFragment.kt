package kz.ablazim.notesapp.note_list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kz.ablazim.notesapp.R
import kz.ablazim.notesapp.databinding.FragmentNoteListBinding
import timber.log.Timber

class NoteListFragment : Fragment(R.layout.fragment_note_list) {

    private lateinit var binding: FragmentNoteListBinding
    private val viewModel: NoteListViewModel by viewModels()
    private val adapter: NoteAdapter by lazy { NoteAdapter(viewModel.todoList) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentNoteListBinding.bind(view)
        binding.rvNotes.adapter = adapter
        Timber.i("onViewCreated called")
    }
}
