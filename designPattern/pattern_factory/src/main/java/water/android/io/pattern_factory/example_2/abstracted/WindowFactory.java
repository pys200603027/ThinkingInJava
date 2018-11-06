package water.android.io.pattern_factory.example_2.abstracted;

import water.android.io.pattern_factory.example_2.bean.Dialog;
import water.android.io.pattern_factory.example_2.bean.InputText;
import water.android.io.pattern_factory.example_2.bean.Navigation;
import water.android.io.pattern_factory.example_2.bean.PageView;
import water.android.io.pattern_factory.example_2.bean.button.Button;
import water.android.io.pattern_factory.example_2.bean.layout.Layout;
import water.android.io.pattern_factory.example_2.bean.list.ListView;
import water.android.io.pattern_factory.example_2.bean.text.Text;
import water.android.io.pattern_factory.example_2.bean.button.WindowButton;
import water.android.io.pattern_factory.example_2.bean.text.WindowText;

public class WindowFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Text createText() {
        return new WindowText();
    }

    @Override
    public Dialog createDialog() {
        return null;
    }

    @Override
    public InputText createInputText() {
        return null;
    }

    @Override
    public Navigation createNavigation() {
        return null;
    }

    @Override
    public ListView createListView() {
        return null;
    }

    @Override
    public PageView createPageView() {
        return null;
    }

    @Override
    public Layout createLayout() {
        return null;
    }
}
