#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class TwoSum
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> mp;

        for (int i = 0; i < nums.size(); i++)
        {
            int need = target - nums[i];

            if (mp.find(need) != mp.end())
            {
                return {mp[need], i}; // Requires C++11 or higher
            }

            mp[nums[i]] = i;
        }

        return {};
    } // Removed extra semicolon
};

// Driver code to make VS Code happy
int main()
{
    TwoSum solution;
    int n, target;

    cout << "Enter target number: ";
    cin >> target;

    // ... rest of your code
}
