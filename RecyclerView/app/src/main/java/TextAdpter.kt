import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class TextAdpter (private val itemList: List<String> ): RecyclerView.Adapter<TextAdpter.TextViewHolder>() {

    class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textItem: TextView = view.findViewById(R.id.textItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false)
        return TextViewHolder(view)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.textItem.text = itemList[position]
        // Bind data to your view components here
    }

    override fun getItemCount() = itemList.size

    }

