package servicd.your.afor.cook.cookbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by iranna.patil on 21/01/2018.
 */

public class CookListAdapter extends ArrayAdapter<CookDetails> {

    public CookListAdapter(Context context, List<CookDetails> values) {
        super(context, R.layout.cook_details, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View cookView = theInflater.inflate(R.layout.cook_details, parent, false);
        CookDetails cookDetails = getItem(position);
        ((TextView) cookView.findViewById(R.id.person_name)).setText(cookDetails.getPersonName());
        ((TextView) cookView.findViewById(R.id.specialist)).setText(cookDetails.getSpecialist());
        ((ImageView) cookView.findViewById(R.id.food_image)).setImageResource(cookDetails.getImageId());
        return cookView;

    }
}
