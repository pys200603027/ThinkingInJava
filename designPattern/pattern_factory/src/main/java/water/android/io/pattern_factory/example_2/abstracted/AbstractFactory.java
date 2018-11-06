package water.android.io.pattern_factory.example_2.abstracted;


import water.android.io.pattern_factory.example_2.bean.button.Button;
import water.android.io.pattern_factory.example_2.bean.Dialog;
import water.android.io.pattern_factory.example_2.bean.InputText;
import water.android.io.pattern_factory.example_2.bean.layout.Layout;
import water.android.io.pattern_factory.example_2.bean.list.ListView;
import water.android.io.pattern_factory.example_2.bean.Navigation;
import water.android.io.pattern_factory.example_2.bean.PageView;
import water.android.io.pattern_factory.example_2.bean.text.Text;

public abstract class AbstractFactory {

    public abstract Button createButton();

    public abstract Text createText();

    public abstract Dialog createDialog();

    public abstract InputText createInputText();

    public abstract Navigation createNavigation();

    public abstract ListView createListView();

    public abstract PageView createPageView();

    public abstract Layout createLayout();
}

