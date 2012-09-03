/*
 * Copyright (C) 2012 V.Shcryabets (vshcryabets@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.v2soft.V2AndLib.demoapp.ui.fragments;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import com.v2soft.AndLib.ui.Adapters.BackLoadingAdapter;
import com.v2soft.AndLib.ui.fragments.BaseDialogFragment;
import com.v2soft.AndLib.ui.fragments.BaseFragment;
import com.v2soft.AndLib.ui.views.IDataView;
import com.v2soft.V2AndLib.demoapp.DemoAppSettings;
import com.v2soft.V2AndLib.demoapp.DemoApplication;
import com.v2soft.V2AndLib.demoapp.R;

/**
 * 
 * @author vshcryabets@gmail.com
 *
 */
public class DemoDialogs 
extends BaseFragment<DemoApplication, DemoAppSettings>  {
    private static final int DLG_EDIT_STRING = 1;

    public static Fragment newInstance() {
        return new DemoDialogs();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View view = inflater.inflate(com.v2soft.AndLib.ui.R.layout.fragment_button_text, null);
        registerOnClickListener(new int[]{R.id.btnStart}, view);
        return view;
    }

    @Override
    public void onClick(View v) {
        showDialog(DLG_EDIT_STRING);
    }

    /**
     * Show a dialog managed by this fragment. A call to onCreateDialog(int) will be made with the same id 
     * is called for a given id.
     * @param dlgId
     */
    public void showDialog(int dlgId) {
        final DialogFragment fragment = onCreateFragmentDialog(dlgId);
        if ( fragment != null ) {
            fragment.show(getFragmentManager(), fragment.getTag());
        } else {
            final Dialog dialog = onCreateDialog(dlgId);
            if (dialog != null ) {
                dialog.show();
            }
        }
    }

    protected Dialog onCreateDialog(int dlgId) {
        return null;
    }

    protected BaseDialogFragment<?,?> onCreateFragmentDialog(int dlgId) {
        switch (dlgId) {
        case DLG_EDIT_STRING:
            return DemoDialogEditString.newInstance("qwewewq");
        default:
            break;
        }
        return null;
    }
}
