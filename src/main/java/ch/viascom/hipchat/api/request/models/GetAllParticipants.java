package ch.viascom.hipchat.api.request.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by patrickboesch on 14.04.16.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllParticipants {
    private String roomId;
    @SerializedName("start-index")
    private int	start_index = 0;
    @SerializedName("max-results")
    private int	max_results = 100;
    @SerializedName("include-offline")
    private boolean include_offline = false;
}
