//
// Created by just it on 2020/5/7.
//

int main() {

    int select = 0;

    while (true)
    {
        showMenu();

        cin >> select;

        switch (select)
        {
            case 1:  //添加联系人
                break;
            case 2:  //显示联系人
                break;
            case 3:  //删除联系人
                break;
            case 4:  //查找联系人
                break;
            case 5:  //修改联系人
                break;
            case 6:  //清空联系人
                break;
            case 0:  //退出通讯录
                cout << "欢迎下次使用" << endl;
                system("pause");
                return 0;
                break;
            default:
                break;
        }
    }

    system("pause");

    return 0;
}

