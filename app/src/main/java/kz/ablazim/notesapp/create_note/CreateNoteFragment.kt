package kz.ablazim.notesapp.create_note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kz.ablazim.notesapp.databinding.FragmentCreateNoteBinding
import kz.ablazim.notesapp.extensions.replaceFragment
import kz.ablazim.notesapp.note_list.NoteListFragment

class CreateNoteFragment : Fragment() {
    private val viewModel: CreateNoteViewModel by viewModels()
    private val noteListFragment = NoteListFragment()
    private lateinit var binding: FragmentCreateNoteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNoteBinding.inflate(inflater, container, false)
        replaceFragment(noteListFragment)
        return binding.root
    }
}