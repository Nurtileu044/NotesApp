package kz.ablazim.notesapp.note_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.ablazim.notesapp.databinding.ItemNoteBinding
import kz.ablazim.notesapp.note_list.NoteAdapter.NoteViewHolder

class NoteAdapter(
    var notes: List<NoteModel>
) : RecyclerView.Adapter<NoteViewHolder>() {

    inner class NoteViewHolder(private val itemNoteBinding: ItemNoteBinding) :
        RecyclerView.ViewHolder(itemNoteBinding.root) {

        fun bind(item: NoteModel) = with(itemNoteBinding) {
            tvTitle.text = item.title
            tvDescription.text = item.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder = NoteViewHolder(ItemNoteBinding.inflate(LayoutInflater.from(parent.context),parent, false))

    override fun getItemCount() = notes.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }
}