package kz.ablazim.notesapp.create_note

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kz.ablazim.notesapp.R
import kz.ablazim.notesapp.databinding.FragmentCreateNoteBinding

class CreateNoteFragment : Fragment(R.layout.fragment_create_note) {

    private lateinit var binding: FragmentCreateNoteBinding
    private val viewModel: CreateNoteViewModel by viewModels()
}