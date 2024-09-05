using System.Numerics;

namespace ConsoleApp1.Classes
{
    public class TimeRestriction
    {
        bool IfCanBeSessionsToday { get; set } // Point 3
        int EarliestSlot { get; set } = 0; // Point 2
        int LatestSlot { get; set } = int.MaxValue; // Point 2

        public TimeRestriction(bool ifCanBeSessionsToday)
        {
            IfCanBeSessionsToday = ifCanBeSessionsToday;
        }

        public TimeRestriction(bool ifCanBeSessionsToday, int earliestSlot, int latestSlot)
        {
            IfCanBeSessionsToday= ifCanBeSessionsToday;
            EarliestSlot = earliestSlot;
            LatestSlot = latestSlot;
        }
    }
}
