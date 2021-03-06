package ch.viascom.hipchat.api.response;

import ch.viascom.hipchat.api.response.generic.Response;
import ch.viascom.hipchat.api.response.generic.ResponseHeader;
import lombok.Data;

/**
 * Created by patrickboesch on 15.04.16.
 */
@Data
public class GroupStatisticsResponse implements Response {
    private ResponseHeader responseHeader;
    private int users;
}
