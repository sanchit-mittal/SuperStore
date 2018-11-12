/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

/**
 *
 * @author PD
 */
public interface Functionalities {
    
    void addCategory(String name);
    void addSub_Category(String name,Category categoryName);
    void addItem(Category categoryName,Sub_Category subCategoryName);
    void updateCategory();
    void updateSub_Category();
    void updateItem();
    void deleteCategory();
    void deleteSub_Category();
    void deleteItem(int index,int index1,int index2,int index3);
    void display();
    Item findItem();
    void sort();
    void order();
    
}
