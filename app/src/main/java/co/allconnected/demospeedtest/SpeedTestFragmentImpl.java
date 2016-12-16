package co.allconnected.demospeedtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
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
    public boolean isShowRightButton() {

        return true;
    }

    @Override
    public void doRightButtonAction() {

        Toast.makeText(getActivity(), "Ad is coming soon ~ ~", Toast.LENGTH_SHORT).show();

    }

    /**
     * 模拟重置按钮点击后先显示广告，然后再测速
     *
     * @author michael
     * @time 16/12/16 下午8:39
     */
    @Override
    public View.OnClickListener getLeftButtonListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    new AlertDialog.Builder(getContext()).setMessage("hey,buddy,I'm AD")
                            .setNegativeButton("ok", null)
                            .setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public void onDismiss(DialogInterface dialog) {
                                    doSpeedTest();
                                }
                            }).create().show();
                }
            }
        };
    }

    @Override
    public String getVpnConnectedServerIp() {
        return null;
    }


}
