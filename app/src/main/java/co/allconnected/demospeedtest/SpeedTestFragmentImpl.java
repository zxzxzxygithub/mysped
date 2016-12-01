package co.allconnected.demospeedtest;

import android.widget.Toast;

import co.allconnected.libspeedtest.view.SpeedTestFragment;

/**
 * Created by michael on 16/11/30.
 */

public class SpeedTestFragmentImpl extends SpeedTestFragment {

    @Override
    public boolean isShowVpnIcon() {
        return true;
    }

    @Override
    public boolean isVpnConnected() {
        return true;
    }

    @Override
    public boolean isShowAd() {

        return true;
    }

    @Override
    public void showAd() {

        Toast.makeText(getActivity(), "Ad is coming soon ~ ~", Toast.LENGTH_SHORT).show();

    }


}
